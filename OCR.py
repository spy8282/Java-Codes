from PIL import Image
import pytesseract
import pyfiglet

# Step 1: Perform OCR on the handwritten text image
def ocr_handwritten_image(image_path):
    # Load the image using PIL
    image = Image.open(image_path)
    
    # Use pytesseract to do OCR on the image
    text = pytesseract.image_to_string(image, config='--psm 6')  # Page segmentation mode 6 assumes a single uniform block of text.
    
    return text.strip()

# Step 2: Convert text to an aesthetic style using pyfiglet
def convert_to_aesthetic_text(text):
    # Convert the text to a stylish aesthetic text using pyfiglet
    aesthetic_text = pyfiglet.figlet_format(text, font="slant")  # You can choose different fonts here
    return aesthetic_text

# Example usage
if __name__ == "__main__":
    image_path = r"C:\Users\om\Downloads\handwritten.webp"  # Replace with your image path
    
    # Step 1: Extract text from the handwritten image
    extracted_text = ocr_handwritten_image(image_path)
    
    print("Extracted Text:")
    print(extracted_text)
    
    # Step 2: Convert the extracted text to aesthetic text
    aesthetic_text = convert_to_aesthetic_text(extracted_text)
    
    print("\nAesthetic Text:")
    print(aesthetic_text)

    